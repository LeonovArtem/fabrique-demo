import {
    List,
    Datagrid,
    DateField,
    TextField,
    EditButton,
    DeleteButton,
    ShowButton,
    Filter,
    TextInput
} from 'react-admin';

const PostFilter = (props) => (
    <Filter {...props}>
        <TextInput label='Поиск' source='q' alwaysOn/>
    </Filter>
);

export const SurveyList = (props) => (
    <List filters={<PostFilter/>} {...props}>
        <Datagrid>
            <TextField source="id"/>
            <TextField label="Название" source="name"/>
            <TextField label="Описание" source="description"/>
            <DateField label="Дата старта" source="startAt"/>
            <DateField label="Дата окончания" source="endAt"/>
            <EditButton basePath="/survey"/>
            <DeleteButton basePath="/survey"/>
            <ShowButton basePath="/survey"/>

        </Datagrid>
    </List>
)

export default SurveyList