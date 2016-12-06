package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionHDITotalIterator theCollection = (CollectionHDITotalIterator)findAncestorWithClass(this, CollectionHDITotalIterator.class);
			pageContext.getOut().print(theCollection.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

