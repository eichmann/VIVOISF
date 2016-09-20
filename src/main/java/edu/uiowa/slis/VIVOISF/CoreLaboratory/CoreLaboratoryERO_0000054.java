package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryERO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryERO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryERO_0000054.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryERO_0000054Iterator theCoreLaboratory = (CoreLaboratoryERO_0000054Iterator)findAncestorWithClass(this, CoreLaboratoryERO_0000054Iterator.class);
			pageContext.getOut().print(theCoreLaboratory.getERO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for ERO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for ERO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

