package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379RelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379RelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379RelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379RelatesIterator theARG_2000379RelatesIterator = (ARG_2000379RelatesIterator)findAncestorWithClass(this, ARG_2000379RelatesIterator.class);
			pageContext.getOut().print(theARG_2000379RelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for relates tag ");
		}
		return SKIP_BODY;
	}
}

