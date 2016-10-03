package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryProducerInverseIterator theLaboratoryProducerInverseIterator = (LaboratoryProducerInverseIterator)findAncestorWithClass(this, LaboratoryProducerInverseIterator.class);
			pageContext.getOut().print(theLaboratoryProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for producer tag ");
		}
		return SKIP_BODY;
	}
}

