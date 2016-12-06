package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasTelephoneIterator theCollectionHasTelephoneIterator = (CollectionHasTelephoneIterator)findAncestorWithClass(this, CollectionHasTelephoneIterator.class);
			pageContext.getOut().print(theCollectionHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

