package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRO_0002353Iterator theCollectionRO_0002353Iterator = (CollectionRO_0002353Iterator)findAncestorWithClass(this, CollectionRO_0002353Iterator.class);
			pageContext.getOut().print(theCollectionRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

