package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryOBI_0000304InverseIterator theLaboratoryOBI_0000304InverseIterator = (LaboratoryOBI_0000304InverseIterator)findAncestorWithClass(this, LaboratoryOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theLaboratoryOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

