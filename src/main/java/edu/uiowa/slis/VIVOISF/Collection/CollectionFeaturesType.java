package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionFeaturesIterator theCollectionFeaturesIterator = (CollectionFeaturesIterator)findAncestorWithClass(this, CollectionFeaturesIterator.class);
			pageContext.getOut().print(theCollectionFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for features tag ");
		}
		return SKIP_BODY;
	}
}

