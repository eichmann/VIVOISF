package edu.uiowa.slis.VIVOISF.ARG_2000376;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000376BroaderType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000376BroaderType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000376BroaderType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000376BroaderIterator theARG_2000376BroaderIterator = (ARG_2000376BroaderIterator)findAncestorWithClass(this, ARG_2000376BroaderIterator.class);
			pageContext.getOut().print(theARG_2000376BroaderIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for broader tag ");
		}
		return SKIP_BODY;
	}
}

