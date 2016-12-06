package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityFreetextKeywordIterator theGeopoliticalEntity = (GeopoliticalEntityFreetextKeywordIterator)findAncestorWithClass(this, GeopoliticalEntityFreetextKeywordIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

