package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionHasMinLatitudeIterator theCollection = (CollectionHasMinLatitudeIterator)findAncestorWithClass(this, CollectionHasMinLatitudeIterator.class);
			pageContext.getOut().print(theCollection.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

