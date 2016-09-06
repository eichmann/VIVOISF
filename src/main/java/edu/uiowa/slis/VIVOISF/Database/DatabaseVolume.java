package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatabaseVolumeIterator theDatabase = (DatabaseVolumeIterator)findAncestorWithClass(this, DatabaseVolumeIterator.class);
			pageContext.getOut().print(theDatabase.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for volume tag ");
		}
		return SKIP_BODY;
	}
}

