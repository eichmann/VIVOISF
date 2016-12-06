package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionRankIterator theCollection = (CollectionRankIterator)findAncestorWithClass(this, CollectionRankIterator.class);
			pageContext.getOut().print(theCollection.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for rank tag ");
		}
		return SKIP_BODY;
	}
}

