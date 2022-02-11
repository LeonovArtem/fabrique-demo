import {
    Create,
    SimpleForm,
    TextInput,
    DateTimeInput
} from 'react-admin'


export const SurveyCreate = (props) => {
    return (
        <Create title="Создание" {...props}>
            <SimpleForm>
                <TextInput label="Название" source="name"/>
                <TextInput label="Описание" multiline source="description"/>
                <DateTimeInput label="Дата старта" source="startAt"/>
                <DateTimeInput label="Дата окончания" source="endAt"/>
            </SimpleForm>
        </Create>
    );

}

export default SurveyCreate