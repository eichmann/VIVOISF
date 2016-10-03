package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionPmidIterator theCollection = (CollectionPmidIterator)findAncestorWithClass(this, CollectionPmidIterator.class);
			pageContext.getOut().print(theCollection.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for pmid tag ");
		}
		return SKIP_BODY;
	}
}

