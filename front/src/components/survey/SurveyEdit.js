import {Edit, SimpleForm, TextInput, DateTimeInput, ReferenceInput, AutocompleteInput} from 'react-admin';

export const SurveyEdit = (props) => (
    <Edit title='Редактирование' {...props}>
        <SimpleForm>
            <TextInput disabled source="id"/>
            <TextInput label="Название" multiline source="name"/>
            <TextInput label="Описание" multiline source="description"/>
            <DateTimeInput label="Дата старта" disabled source="startAt"/>
            <DateTimeInput label="Дата окончания" source="endAt"/>
        </SimpleForm>
    </Edit>
);

export default SurveyEdit