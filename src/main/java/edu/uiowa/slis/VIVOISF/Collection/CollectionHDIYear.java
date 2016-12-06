package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionHDIYearIterator theCollection = (CollectionHDIYearIterator)findAncestorWithClass(this, CollectionHDIYearIterator.class);
			pageContext.getOut().print(theCollection.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

