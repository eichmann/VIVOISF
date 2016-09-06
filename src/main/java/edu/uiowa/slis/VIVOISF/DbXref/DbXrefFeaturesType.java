package edu.uiowa.slis.VIVOISF.DbXref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DbXrefFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DbXrefFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DbXrefFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DbXrefFeaturesIterator theDbXrefFeaturesIterator = (DbXrefFeaturesIterator)findAncestorWithClass(this, DbXrefFeaturesIterator.class);
			pageContext.getOut().print(theDbXrefFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for features tag ");
		}
		return SKIP_BODY;
	}
}

