package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryOwnerInverseIterator theLaboratoryOwnerInverseIterator = (LaboratoryOwnerInverseIterator)findAncestorWithClass(this, LaboratoryOwnerInverseIterator.class);
			pageContext.getOut().print(theLaboratoryOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for owner tag ");
		}
		return SKIP_BODY;
	}
}

