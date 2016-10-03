package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryProducerInverseIterator theCoreLaboratoryProducerInverseIterator = (CoreLaboratoryProducerInverseIterator)findAncestorWithClass(this, CoreLaboratoryProducerInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for producer tag ");
		}
		return SKIP_BODY;
	}
}

