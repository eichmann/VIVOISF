package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentEditorIterator thePersonalCommunicationDocumentEditorIterator = (PersonalCommunicationDocumentEditorIterator)findAncestorWithClass(this, PersonalCommunicationDocumentEditorIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for editor tag ");
		}
		return SKIP_BODY;
	}
}

