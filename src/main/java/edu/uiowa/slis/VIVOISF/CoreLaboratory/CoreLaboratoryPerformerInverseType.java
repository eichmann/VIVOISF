package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryPerformerInverseIterator theCoreLaboratoryPerformerInverseIterator = (CoreLaboratoryPerformerInverseIterator)findAncestorWithClass(this, CoreLaboratoryPerformerInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for performer tag ");
		}
		return SKIP_BODY;
	}
}

