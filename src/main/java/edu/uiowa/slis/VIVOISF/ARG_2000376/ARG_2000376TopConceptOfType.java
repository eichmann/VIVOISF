package edu.uiowa.slis.VIVOISF.ARG_2000376;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000376TopConceptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000376TopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000376TopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000376TopConceptOfIterator theARG_2000376TopConceptOfIterator = (ARG_2000376TopConceptOfIterator)findAncestorWithClass(this, ARG_2000376TopConceptOfIterator.class);
			pageContext.getOut().print(theARG_2000376TopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

