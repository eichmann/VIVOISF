package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentEditorListIterator thePersonalCommunicationDocumentEditorListIterator = (PersonalCommunicationDocumentEditorListIterator)findAncestorWithClass(this, PersonalCommunicationDocumentEditorListIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for editorList tag ");
		}
		return SKIP_BODY;
	}
}

