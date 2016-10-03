package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyEditorInverseIterator thePrivateCompanyEditorInverseIterator = (PrivateCompanyEditorInverseIterator)findAncestorWithClass(this, PrivateCompanyEditorInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for editor tag ");
		}
		return SKIP_BODY;
	}
}

