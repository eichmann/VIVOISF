package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionHasMinLongitudeIterator theCollection = (CollectionHasMinLongitudeIterator)findAncestorWithClass(this, CollectionHasMinLongitudeIterator.class);
			pageContext.getOut().print(theCollection.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

