import {Create, SimpleForm, TextInput, SelectInput} from 'react-admin'
import {QUESTION_TYPES} from './constants/index'

export const QuestionCreate = (props) => (
    <Create title="Создание" {...props}>
        <SimpleForm>
            <TextInput label="Текст вопроса" multiline source="text"/>
            <SelectInput label="Тип" source="type" choices={QUESTION_TYPES}/>
        </SimpleForm>
    </Create>
)

export default QuestionCreate