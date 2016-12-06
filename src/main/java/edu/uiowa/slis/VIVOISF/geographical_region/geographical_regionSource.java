package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionSource currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionSourceIterator thegeographical_region = (geographical_regionSourceIterator)findAncestorWithClass(this, geographical_regionSourceIterator.class);
			pageContext.getOut().print(thegeographical_region.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for source tag ");
		}
		return SKIP_BODY;
	}
}

