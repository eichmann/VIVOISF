package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratorySuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratorySuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratorySuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LaboratorySuffixNameIterator theLaboratory = (LaboratorySuffixNameIterator)findAncestorWithClass(this, LaboratorySuffixNameIterator.class);
			pageContext.getOut().print(theLaboratory.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

