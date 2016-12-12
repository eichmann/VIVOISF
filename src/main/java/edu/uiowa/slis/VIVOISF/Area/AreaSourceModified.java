package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaSourceModifiedIterator theArea = (AreaSourceModifiedIterator)findAncestorWithClass(this, AreaSourceModifiedIterator.class);
			pageContext.getOut().print(theArea.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

