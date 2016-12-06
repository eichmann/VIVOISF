package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterRelatesIterator theConferencePosterRelatesIterator = (ConferencePosterRelatesIterator)findAncestorWithClass(this, ConferencePosterRelatesIterator.class);
			pageContext.getOut().print(theConferencePosterRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for relates tag ");
		}
		return SKIP_BODY;
	}
}

