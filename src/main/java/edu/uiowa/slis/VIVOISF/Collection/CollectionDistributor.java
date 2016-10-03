package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionDistributorIterator theCollectionDistributorIterator = (CollectionDistributorIterator)findAncestorWithClass(this, CollectionDistributorIterator.class);
			pageContext.getOut().print(theCollectionDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for distributor tag ");
		}
		return SKIP_BODY;
	}
}

