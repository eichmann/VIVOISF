package edu.uiowa.slis.VIVOISF.ARG_2000376;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000376Narrower extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000376Narrower currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000376Narrower.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000376NarrowerIterator theARG_2000376NarrowerIterator = (ARG_2000376NarrowerIterator)findAncestorWithClass(this, ARG_2000376NarrowerIterator.class);
			pageContext.getOut().print(theARG_2000376NarrowerIterator.getNarrower());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for narrower tag ");
		}
		return SKIP_BODY;
	}
}

