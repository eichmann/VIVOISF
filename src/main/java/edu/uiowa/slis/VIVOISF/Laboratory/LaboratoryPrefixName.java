package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LaboratoryPrefixNameIterator theLaboratory = (LaboratoryPrefixNameIterator)findAncestorWithClass(this, LaboratoryPrefixNameIterator.class);
			pageContext.getOut().print(theLaboratory.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

