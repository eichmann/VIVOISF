package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionInformationResourceSupportedByIterator theCollectionInformationResourceSupportedByIterator = (CollectionInformationResourceSupportedByIterator)findAncestorWithClass(this, CollectionInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theCollectionInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

