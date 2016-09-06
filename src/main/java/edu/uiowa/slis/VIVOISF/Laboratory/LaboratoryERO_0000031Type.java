package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryERO_0000031Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryERO_0000031Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryERO_0000031Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryERO_0000031Iterator theLaboratoryERO_0000031Iterator = (LaboratoryERO_0000031Iterator)findAncestorWithClass(this, LaboratoryERO_0000031Iterator.class);
			pageContext.getOut().print(theLaboratoryERO_0000031Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

