package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionSourceModifiedIterator thegeographical_region = (geographical_regionSourceModifiedIterator)findAncestorWithClass(this, geographical_regionSourceModifiedIterator.class);
			pageContext.getOut().print(thegeographical_region.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

