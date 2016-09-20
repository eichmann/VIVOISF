package edu.uiowa.slis.VIVOISF.ARG_2000376;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000376RelatedInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000376RelatedInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000376RelatedInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000376RelatedInverseIterator theARG_2000376RelatedInverseIterator = (ARG_2000376RelatedInverseIterator)findAncestorWithClass(this, ARG_2000376RelatedInverseIterator.class);
			pageContext.getOut().print(theARG_2000376RelatedInverseIterator.getRelatedInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for related tag ");
		}
		return SKIP_BODY;
	}
}

