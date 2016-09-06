package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryERO_0001520Iterator theCoreLaboratoryERO_0001520Iterator = (CoreLaboratoryERO_0001520Iterator)findAncestorWithClass(this, CoreLaboratoryERO_0001520Iterator.class);
			pageContext.getOut().print(theCoreLaboratoryERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

