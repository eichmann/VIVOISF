package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityRank currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityRankIterator theGeopoliticalEntity = (GeopoliticalEntityRankIterator)findAncestorWithClass(this, GeopoliticalEntityRankIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for rank tag ");
		}
		return SKIP_BODY;
	}
}

