package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryCourtInverseIterator theCoreLaboratoryCourtInverseIterator = (CoreLaboratoryCourtInverseIterator)findAncestorWithClass(this, CoreLaboratoryCourtInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for court tag ");
		}
		return SKIP_BODY;
	}
}

