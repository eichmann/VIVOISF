package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryERO_0001520Iterator theLaboratoryERO_0001520Iterator = (LaboratoryERO_0001520Iterator)findAncestorWithClass(this, LaboratoryERO_0001520Iterator.class);
			pageContext.getOut().print(theLaboratoryERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

