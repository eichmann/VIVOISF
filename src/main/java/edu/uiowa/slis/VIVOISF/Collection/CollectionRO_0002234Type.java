package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRO_0002234Iterator theCollectionRO_0002234Iterator = (CollectionRO_0002234Iterator)findAncestorWithClass(this, CollectionRO_0002234Iterator.class);
			pageContext.getOut().print(theCollectionRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

