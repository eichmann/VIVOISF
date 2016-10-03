package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryPerformerInverseIterator theCoreLaboratoryPerformerInverseIterator = (CoreLaboratoryPerformerInverseIterator)findAncestorWithClass(this, CoreLaboratoryPerformerInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for performer tag ");
		}
		return SKIP_BODY;
	}
}

