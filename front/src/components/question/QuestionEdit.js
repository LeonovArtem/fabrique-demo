import {Edit, SimpleForm, TextInput, SelectInput} from 'react-admin';
import {QUESTION_TYPES} from './constants/index'

export const QuestionEdit = (props) => (
    <Edit title='Редактирование' {...props}>
        <SimpleForm>
            <TextInput disabled source="id"/>
            <TextInput label="Текст вопроса" multiline source="text"/>
            <SelectInput label="Тип" source="type" choices={QUESTION_TYPES}/>
        </SimpleForm>
    </Edit>
);

export default QuestionEdit