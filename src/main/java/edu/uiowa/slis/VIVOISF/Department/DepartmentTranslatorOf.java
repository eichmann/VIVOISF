package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentTranslatorOfIterator theDepartmentTranslatorOfIterator = (DepartmentTranslatorOfIterator)findAncestorWithClass(this, DepartmentTranslatorOfIterator.class);
			pageContext.getOut().print(theDepartmentTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

