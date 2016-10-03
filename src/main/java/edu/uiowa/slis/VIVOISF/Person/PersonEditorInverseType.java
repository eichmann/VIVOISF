package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonEditorInverseIterator thePersonEditorInverseIterator = (PersonEditorInverseIterator)findAncestorWithClass(this, PersonEditorInverseIterator.class);
			pageContext.getOut().print(thePersonEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for editor tag ");
		}
		return SKIP_BODY;
	}
}

