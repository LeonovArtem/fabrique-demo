import {
    List,
    Datagrid,
    TextField,
    EditButton,
    DeleteButton,
    ShowButton,
    Filter,
    TextInput,
} from 'react-admin';

const QuestionFilter = (props) => (
    <Filter {...props}>
        <TextInput label='Поиск' source='q' alwaysOn/>
    </Filter>
);

export const QuestionList = (props) => (
    <List filters={<QuestionFilter/>} {...props}>
        <Datagrid>
            <TextField source="id"/>
            <TextField label="Текст вопроса" source="text"/>
            <TextField label="Тип" source="type"/>
            <EditButton basePath="/question"/>
            <DeleteButton basePath="/question"/>
            <ShowButton basePath="/question"/>

        </Datagrid>
    </List>
)

export default QuestionList