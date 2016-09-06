package edu.uiowa.slis.VIVOISF.Photo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PhotoRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PhotoRank currentInstance = null;
	private static final Log log = LogFactory.getLog(PhotoRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PhotoRankIterator thePhoto = (PhotoRankIterator)findAncestorWithClass(this, PhotoRankIterator.class);
			pageContext.getOut().print(thePhoto.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Photo for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Photo for rank tag ");
		}
		return SKIP_BODY;
	}
}

