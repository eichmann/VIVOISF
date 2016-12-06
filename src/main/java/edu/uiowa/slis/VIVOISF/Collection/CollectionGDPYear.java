package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionGDPYearIterator theCollection = (CollectionGDPYearIterator)findAncestorWithClass(this, CollectionGDPYearIterator.class);
			pageContext.getOut().print(theCollection.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

