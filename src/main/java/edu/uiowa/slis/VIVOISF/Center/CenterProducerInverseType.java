package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterProducerInverseIterator theCenterProducerInverseIterator = (CenterProducerInverseIterator)findAncestorWithClass(this, CenterProducerInverseIterator.class);
			pageContext.getOut().print(theCenterProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for producer tag ");
		}
		return SKIP_BODY;
	}
}

