package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaSource currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaSourceIterator theArea = (AreaSourceIterator)findAncestorWithClass(this, AreaSourceIterator.class);
			pageContext.getOut().print(theArea.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for source tag ");
		}
		return SKIP_BODY;
	}
}

