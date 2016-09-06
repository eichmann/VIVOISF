package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(areaSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			if (!thearea.commitNeeded) {
				pageContext.getOut().print(thearea.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing area for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			return thearea.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing area for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			thearea.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing area for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for subjectURI tag ");
		}
	}
}

