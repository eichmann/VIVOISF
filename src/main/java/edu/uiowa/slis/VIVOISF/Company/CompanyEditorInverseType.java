package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyEditorInverseIterator theCompanyEditorInverseIterator = (CompanyEditorInverseIterator)findAncestorWithClass(this, CompanyEditorInverseIterator.class);
			pageContext.getOut().print(theCompanyEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for editor tag ");
		}
		return SKIP_BODY;
	}
}

