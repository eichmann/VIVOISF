package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentEditorListIterator thePersonalCommunicationDocumentEditorListIterator = (PersonalCommunicationDocumentEditorListIterator)findAncestorWithClass(this, PersonalCommunicationDocumentEditorListIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for editorList tag ");
		}
		return SKIP_BODY;
	}
}

