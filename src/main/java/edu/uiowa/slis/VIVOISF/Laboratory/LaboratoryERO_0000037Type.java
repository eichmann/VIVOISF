package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryERO_0000037Iterator theLaboratoryERO_0000037Iterator = (LaboratoryERO_0000037Iterator)findAncestorWithClass(this, LaboratoryERO_0000037Iterator.class);
			pageContext.getOut().print(theLaboratoryERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

